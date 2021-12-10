import React, {useState, useHistory} from "react";
 import axios from "axios";
 import AnimalService from "../../service/AnimalService";
 import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";

 function AnimalProblems() {

    // const history = useHistory();
     const[myArray, setMyArray] = React.useState([]);

     // React.useEffect(() => {
     //   axios.get(ANIMAL_REST_API_URL).then(response => setMyArray(response.data));
     // }, []);

     const id = 1;

     React.useEffect(() => {
       AnimalService.getAnimalProblems(id).then(response => setMyArray(response.data));
     }, []);
    // const[count, setCount] = useState(0);

    // const changePage = () =>{ 
    //   let path = "/AnimalProblems/:id"; 
    //   history.push(path);
    // }

    return(
        <div class = "columns"> 
        <div class="column">
            <table class="table">
            <thead>
            <tr>
                <th>Animal ID</th>
                <th>Disease</th>
                <th>Description</th>
            </tr>
            </thead>
            <tbody>
            {
                myArray.map(myArray =>
                    <tr key={myArray.id}>
                    <td>{myArray.animalId}</td>
                    <td>{myArray.disease}</td>
                    <td>{myArray.description}</td>
                    </tr>)
            }
            </tbody>
        </table>
        </div>
          <div class="column is-narrow">
            {/* <button class="button is-dark" onCLick={changePage}>Add Animal Problem</button>   */}
            <Link to="/AnimalProblems/:id" className="btn btn-primary">Add Problem</Link>
          </div>
      </div>
    );
};

export default AnimalProblems;