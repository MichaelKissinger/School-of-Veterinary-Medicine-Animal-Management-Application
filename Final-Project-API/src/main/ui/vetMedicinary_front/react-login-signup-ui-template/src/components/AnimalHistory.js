import React, {useState} from "react";

const AnimalHistory = () => {
  
    // const[count, setCount] = useState(0);
    return(
        <div class = "columns"> 
        <div class="column">
            <table class="table">
            <thead>
            <tr>
                <th>Record ID</th>
                <th>Date</th>
                <th>Measurement</th>
                <th>Value</th>
                <th>User ID</th>
                <th>Vaccination</th>
                <th>Animal ID</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th>1</th>
                <th>2019-04-23</th>
                <th>107</th>
                <th>Value</th>
                <th>123589</th>
                <th>N</th>
                <th>103</th>
            </tr>
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