import React, {useState} from "react";
import axios from "axios";
import AnimalService from "../../service/AnimalService";

const ANIMAL_REST_API_URL = 'http://localhost:8080/animal/history/1';

const AnimalHistory = () => {

    const[myArray, setMyArray] = React.useState([]);

    // React.useEffect(() => {
    //   axios.get(ANIMAL_REST_API_URL).then(response => setMyArray(response.data));
    // }, []);

    //TODO Figure out how to pass ID from animal Profile to here and set to ID
    const id = 1;

    React.useEffect(() => {
      AnimalService.getAnimalHistory(id).then(response => setMyArray(response.data));
    }, []);


    return(
        <div class = "columns"> 
        <div class="column">
            <table class="table">
            <thead>
            <tr>
                <th>Record ID</th>
                <th>Date</th>
                <th>Measurement/Type</th>
                <th>Value</th>
                <th>User ID</th>
                <th>Vaccination</th>
                <th>Animal ID</th>
            </tr>
            </thead>
            <tbody>
            {
                myArray.map(myArray =>
                    <tr key={myArray.id}>
                    <td>{myArray.recordId}</td>
                    <td>{myArray.date}</td>
                    <td>{myArray.measurement}</td>
                    <td>{myArray.value}</td>
                    <td>{myArray.userId}</td>
                    <td>{myArray.vaccination}</td>
                    <td>{myArray.animalId}</td>
                    </tr>)
            }
            </tbody>
        </table>
        </div>
          <div class="column is-narrow">
            <button class="button is-dark">Add Animal History</button>  
          </div>
      </div>
    );
};

export default AnimalHistory;