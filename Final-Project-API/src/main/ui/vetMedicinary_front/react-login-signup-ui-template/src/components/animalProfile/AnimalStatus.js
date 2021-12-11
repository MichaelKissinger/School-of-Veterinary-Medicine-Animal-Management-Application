import React, { useEffect, useState, useRef } from "react";
 import axios from "axios";
 import AnimalService from "../../service/AnimalService";

 const AnimalStatus = (props) => {
     const[changeStatus, setChangeStatus] = React.useState();
     const statusText = useRef();
     const id = props.id;
//TODO Fix issue where update status button must be pressed twice, 
//Also once that is fixed the refresh page at bottom of function can be uncommented
//This refreshes page and shows updated status
  function statusInput(e) {
    setChangeStatus(statusText.current.value);
    console.log(changeStatus);
    //   setChangeStatus = newUpdate;
    const status = {Status : changeStatus};
       axios.put('http://localhost:8080/animal/updateStatus/' + id, status)
           .then();
    // window.location.reload(false);
  }

    return(
        <div class="field has-addons">
            <div class="control">
                {/* <input class="input" type="text" placeholder="Update Status" onChange={e => setChangeStatus(e.target.value)}/> */}
                <input class="input" type="text" placeholder="Update Status" ref={statusText}/>
            </div>
            <div class="control">
                <a class="button is-info" onClick={statusInput}>
                    Update
                </a>
            </div>
        </div>
    
    );
};

export default AnimalStatus;