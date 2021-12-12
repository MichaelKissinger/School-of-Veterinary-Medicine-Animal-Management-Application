import React from "react";
import "bulma/css/bulma.css"
import AnimalService from "../../service/AnimalService";

const AnimalComments = (props) => {
  
    const[myArray, setMyArray] = React.useState([]);
    const id = localStorage.getItem('currentAnimal');

    React.useEffect(() => {
        AnimalService.getAnimalComments(id).then(response => setMyArray(response.data));
      }, []);

    return(
        <div class="rows">
            <div class="row">
            <table class="table">
            <thead>
            <tr>
                <th>Comment ID</th>
                <th>Record ID</th>
                <th>Comment</th>
            </tr>
            </thead>
            <tbody>
            {
                myArray.map(myArray =>
                    <tr key={myArray.id}>
                    <td>{myArray.commentId}</td>
                    <td>{myArray.recordId}</td>
                    <td>{myArray.description}</td>
                    </tr>)
            } 
            </tbody>
        </table>
            </div>
            <br></br>
            <br></br>
            <div class="row">
                <div class = "columns"> 
                <div class="column">
                    <textarea class="textarea" placeholder="Enter Comment"></textarea>
                </div>
                <div class="column">
                <button class="button is-dark">Add Comment</button>  
                </div>
                </div>
            </div>
        </div>
    );
};

export default AnimalComments;