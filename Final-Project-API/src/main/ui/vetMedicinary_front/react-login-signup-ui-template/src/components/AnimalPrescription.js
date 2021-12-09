import React, {useState} from "react";
import axios from "axios";

const ANIMAL_REST_API_URL = 'http://localhost:8080/animal/1/prescriptions';

const AnimalPrescription = () => {

    const[myArray, setMyArray] = React.useState([]);

    React.useEffect(() => {
      axios.get(ANIMAL_REST_API_URL).then(response => setMyArray(response.data));
    }, []);
  
    return(
        <div class = "columns"> 
        <div class="column">
            <table class="table">
            <thead>
            <tr>
                <th>scriptRecord</th>
                <th>drugName</th>
                <th>deliveryMethod</th>
                <th>userId</th>
                <th>date</th>
                <th>dosage</th>
                <th>instructions</th>
                <th>treatmentMethod</th>
                <th>animalId</th>
            </tr>
            </thead>
            <tbody>
            {
                myArray.map(myArray =>
                    <tr key={myArray.id}>
                    <td>{myArray.scriptRecord}</td>
                    <td>{myArray.drugName}</td>
                    <td>{myArray.deliveryMethod}</td>
                    <td>{myArray.userId}</td>
                    <td>{myArray.date}</td>
                    <td>{myArray.dosage}</td>
                    <td>{myArray.instructions}</td>
                    <td>{myArray.treatmentMethod}</td>
                    <td>{myArray.animalId}</td>
                    </tr>)
            }
            </tbody>
        </table>
        </div>
          <div class="column is-narrow">
            <button class="button is-dark">Add Animal Prescription</button>  
          </div>
      </div>
    );
};

export default AnimalPrescription;