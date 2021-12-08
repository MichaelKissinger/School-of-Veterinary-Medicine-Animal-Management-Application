import React, {useState} from "react";
import axios from "axios";

const ANIMAL_REST_API_URL = 'http://localhost:8080/animal/103/problems';

const AnimalProblems = () => {
  
    const[myArray, setMyArray] = React.useState([]);

    React.useEffect(() => {
      axios.get(ANIMAL_REST_API_URL).then(response => setMyArray(response.data));
    }, []);

    // const[count, setCount] = useState(0);
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
            <button class="button is-dark">Add Animal Problem</button>  
          </div>
      </div>
    );
};

export default AnimalProblems;