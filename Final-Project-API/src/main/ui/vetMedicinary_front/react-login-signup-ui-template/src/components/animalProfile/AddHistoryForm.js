import React, { useEffect, useState, useRef } from "react";
 import axios from "axios";
 import AnimalService from "../../service/AnimalService";

 const AddHistoryForm = (props) => {
     const[addMeasurement, setMeasurement] = React.useState();
     const[addValue, setValue] = React.useState();
     const[addVaccination, setVaccination] = React.useState();
     const userId = localStorage.getItem('username');
     const id = localStorage.getItem('currentAnimal');

  function historyInput(e) {
    const newHistory = {
        measurement : addMeasurement,
        value : addValue,
        userId : userId,
        vaccination : addVaccination,
    };
    console.log(newHistory );
       axios.post('http://localhost:8080/animal/addHistory/' + id, newHistory )
           .then();
  }

    return(
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
                            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
                            </div>
                            <h3 class="title is-3">Add Animal History</h3>
                            <div class="col-md-8 order-md-1">

                                <div class="field">
                                    <label class="label">History Type or Measurement</label>
                                    <div class="control">
                                        <input class="input" type="text" placeholder="enter history type or measurement"  onChange={e => setMeasurement(e.target.value)}/>
                                    </div>
                                </div>

                                <div class="field">
                                    <label class="label">Value</label>
                                    <div class="control">
                                        <input class="input" type="text" placeholder="enter value" onChange={e => setValue(e.target.value)}/>
                                    </div>
                                </div>

                                <div class="field">
                                    <label class="label">Is this a vaccination record? (y/n)</label>
                                    <div class="control">
                                        <input class="input" type="text" placeholder="enter y/n"  onChange={e => setVaccination(e.target.value)}/>
                                    </div>
                                </div>
               
                                {/* <button type="submit" className="btn btn-primary btn-block" onClick={problemInput}>Add Animal Problem</button> */}
                                <a class="button is-info" onClick={historyInput}>
                                    Add Animal Prescription
                                </a>
                            </div>

                        </main>
    
    );
};

export default AddHistoryForm;