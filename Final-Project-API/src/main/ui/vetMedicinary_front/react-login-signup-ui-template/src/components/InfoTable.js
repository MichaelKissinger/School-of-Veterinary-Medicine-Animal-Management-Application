import React, {useState} from "react";

const InfoTable = () => {
  
    // const[count, setCount] = useState(0);
    return(
      <div class = "columns"> 
        <div class="column">
          <table class="table">
            <thead>
              <tr>
                <th>Name</th>
                <th>Animal ID</th>
                <th>Breed</th>
                <th>City</th>
                <th>Date of Birth</th>
                <th>Sex</th>
                <th>Status</th>
                <th>Tattoo</th>
                <th>Type</th>
                <th>User ID</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>Cinnamon</td>
                <td>12345</td>
                <td>DSH</td>
                <td>Calgary</td>
                <td>Feb 21, 2010</td>
                <td>M</td>
                <td>Available</td>
                <td>Tattoo</td>
                <td>Type</td>
                <td>User ID</td>
              </tr>
            </tbody>
          </table>
      </div>
          <div class="column is-narrow">
            <button class="button is-dark">Update Animal Status</button>  
          </div>
      </div>
    );
};

export default InfoTable;