import React, {useState} from "react";

const AnimalPrescription = () => {
  
    // const[count, setCount] = useState(0);
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
            <tr>
                <th>1</th>
                <th>Rutin</th>
                <th>Oral</th>
                <th>45632</th>
                <th>2021-12-08</th>
                <th>20</th>
                <th>Give to the animal once a day with food</th>
                <th>To reduce pain</th>
                <th>101</th>
            </tr>
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