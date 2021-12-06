import React, {useState} from "react";

const AnimalProblems = () => {
  
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
            <tr>
                <td>101</td>
                <td>Arthritis</td>
                <td>This cat has bad arthritis</td>
            </tr>
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