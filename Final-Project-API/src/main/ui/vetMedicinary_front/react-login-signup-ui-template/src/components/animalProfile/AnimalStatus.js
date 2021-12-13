import React, { useEffect, useState, useRef } from "react";
 import axios from "axios";
 import AnimalService from "../../service/AnimalService";
 import swal from 'sweetalert';

 const AnimalStatus = (props) => {
     const[changeStatus, setChangeStatus] = React.useState();
     const statusText = useRef();
     const id = props.id;
//TODO Fix issue where update status button must be pressed twice, 
//Also once that is fixed the refresh page at bottom of function can be uncommented
//This refreshes page and shows updated status
  function statusInput(e) {
    // setChangeStatus(statusText.current.value);
    console.log(changeStatus);
    //   setChangeStatus = newUpdate;
    const status = {Status : changeStatus};
       axios.put('http://localhost:8080/animal/updateStatus/' + id, status)
           .then();
    window.location.reload(false);
  }

    return(
        <div class="field has-addons">
        <div class="rows">
            <div class="row">
            <div class="control">
                <label for="type"></label>
                    <input type="text"
                        onChange={e => setChangeStatus(e.target.value)}
                        className="form-control" id="type" placeholder="Enter New Status" required />
                    <div className="invalid-feedback">
                        Valid type is required.
                    </div>
            </div>
            </div>
            <div class="row">

                <a class="button is-info" onClick={statusInput}>
                    Update
                </a>
                </div>
                </div>
        </div>
    );
};

export default AnimalStatus;