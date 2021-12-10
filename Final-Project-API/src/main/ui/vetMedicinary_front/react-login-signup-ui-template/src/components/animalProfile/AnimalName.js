import React, { useEffect, useState } from "react";
import axios from "axios";

const ANIMAL_REST_API_URL = 'http://localhost:8080/animal/1';

const AnimalName = () => {
  
    const[myArray, setMyArray] = React.useState([]);

    React.useEffect(() => {
      axios.get(ANIMAL_REST_API_URL).then(response => setMyArray(response.data));
    }, []);

    return(
      <div> 
          <h1 class="title">{myArray.name}'s Animal Page</h1>
      </div>
    );
};

export default AnimalName;