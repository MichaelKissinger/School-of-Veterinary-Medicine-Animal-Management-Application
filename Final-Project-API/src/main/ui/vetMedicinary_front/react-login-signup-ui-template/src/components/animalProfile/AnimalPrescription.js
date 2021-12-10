import React, {useState} from "react";
 import axios from "axios";
 import AnimalService from "../../service/AnimalService";
 import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";

 const AnimalPrescription = () => {

     const[myArray, setMyArray] = React.useState([]);

     //TODO Figure out how to pass ID from animal Profile to here and set to ID
     const id = 1;

     React.useEffect(() => {
       AnimalService.getAnimalPrescriptions(id).then(response => setMyArray(response.data));
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
            {/* <button class="button is-dark">Add Animal Prescription</button>   */}
            <Link to="/AnimalPrescriptions/:id" className="btn btn-primary">Add Animal Prescription</Link>
          </div>
      </div>
    );
};

export default AnimalPrescription;