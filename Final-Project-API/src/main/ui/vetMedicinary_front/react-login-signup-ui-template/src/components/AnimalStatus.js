import React, { useEffect, useState, useRef } from "react";
import axios from "axios";

const ANIMAL_REST_API_URL = 'http://localhost:8080/animal';

const AnimalStatus = () => {
  
    const[myArray, setMyArray] = React.useState([]);
    const[changeStatus, setChangeStatus] = React.useState();
    const statusText = useRef();

    React.useEffect(() => {
      axios.get(`${ANIMAL_REST_API_URL}/1`).then(response => setMyArray(response.data));
    }, []);

    //TODO Not working yet
    const sendStatus = React.useEffect(() => {
      // PUT request using axios inside useEffect React hook
      const status = {Status : "Test"};
      axios.put('http://localhost:8080/animal/updateStatus/1', status)
          .then();
  // empty dependency array means this effect will only run once (like componentDidMount in classes)
  }, []);

  function statusInput(e) {
    setChangeStatus(statusText.current.value);
    console.log(changeStatus);
    //   setChangeStatus = newUpdate;
    
      
  }

    return(
        <div class="field has-addons">
            <div class="control">
                {/* <input class="input" type="text" placeholder="Update Status" onChange={e => setChangeStatus(e.target.value)}/> */}
                <input class="input" type="text" placeholder="Update Status" ref={statusText}/>
            </div>
            <div class="control">
                <a class="button is-info" onClick={() => this.editEmployee()}>
                    Update
                </a>
            </div>
        </div>
    
    );
};

export default AnimalStatus;