import React, { useEffect, useState, useRef } from "react";
 import axios from "axios";
 import AnimalService from "../../service/AnimalService";

 const AddProblemForm = () => {
    //  const[addDisease, setAddDisease] = React.useState();
    //  const[addDescription, setAddDescription] = React.useState();
    //  const diseaseText = useRef();
    //  const descriptionText = useRef();
    //  const id = 1;

  function problemInput(e) {
    // setAddProblem(statusText.current.value);
    // console.log(changeStatus);
    //   setChangeStatus = newUpdate;
    const newProblem = { disease: 'diseaseText', description: 'descriptionText'};
    console.log(newProblem);
    //    axios.post('http://localhost:8080/animal/addProblem/' + id, newProblem)
    //        .then();
    // window.location.reload(false);
  }

    return(
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
                            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
                            </div>
                            <h3 class="title is-3">Add Animal Problem</h3>
                            <div class="col-md-8 order-md-1">
                                <div class="field">
                                    <label class="label">Disease</label>
                                    <div class="control">
                                        <input class="input" type="text" placeholder="enter disease"/>
                                    </div>
                                    </div>

                                    <div class="field">
                                    <label class="label">Description</label>
                                    <div class="control">
                                        <input class="input" type="text" placeholder="enter description"/>
                                    </div>
                                    </div>
                 
                                <button type="submit" className="btn btn-primary btn-block" onClick={problemInput}>Add Animal Problem</button>
                            </div>
                        </main>



        // <div class="field has-addons">
        //     <div class="control">
        //         {/* <input class="input" type="text" placeholder="Update Status" onChange={e => setChangeStatus(e.target.value)}/> */}
        //         <input class="input" type="text" placeholder="Update Status" ref={statusText}/>
        //     </div>
        //     <div class="control">
        //         <a class="button is-info" onClick={statusInput}>
        //             Update
        //         </a>
        //     </div>
        // </div>
    
    );
};

export default AddProblemForm;