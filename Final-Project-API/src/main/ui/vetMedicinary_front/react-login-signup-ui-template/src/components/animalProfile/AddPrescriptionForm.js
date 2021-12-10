import React, { useEffect, useState, useRef } from "react";
 import axios from "axios";
 import AnimalService from "../../service/AnimalService";

 const AddPrescriptionForm = () => {
     const[addDrugName, setDrugName] = React.useState();
     const[addDeliveryMethod, setDeliveryMethod] = React.useState();
     const[addDosage, setDosage] = React.useState();
     const[addInstructions, setInstructions] = React.useState();
     const[addTreatmentMethod, setTreatmentMethod] = React.useState();
    //  const diseaseText = useRef();
    //  const descriptionText = useRef();
     const id = 1;
     const userId = 1;

  function problemInput(e) {
    // console.log(changeStatus);
    //   setChangeStatus = newUpdate;
    const newPrescription = {
        drugName : addDrugName,
        deliveryMethod : addDeliveryMethod,
        userId : userId,
        dosage : addDosage,
        instructions : addInstructions,
        treatmentMethod : addTreatmentMethod
    };
    console.log(newPrescription);
       axios.post('http://localhost:8080/animal/addPrescription/' + id, newPrescription)
           .then();
    // window.location.reload(false);
  }

    return(
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
                            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
                            </div>
                            <h3 class="title is-3">Add Animal Prescription</h3>
                            <div class="col-md-8 order-md-1">

                                <div class="field">
                                    <label class="label">Drug Name</label>
                                    <div class="control">
                                        <input class="input" type="text" placeholder="enter Drug Name"  onChange={e => setDrugName(e.target.value)}/>
                                    </div>
                                </div>

                                <div class="field">
                                    <label class="label">Delivery Method</label>
                                    <div class="control">
                                        <input class="input" type="text" placeholder="enter Delivery Method" onChange={e => setDeliveryMethod(e.target.value)}/>
                                    </div>
                                </div>

                                <div class="field">
                                    <label class="label">Dosage</label>
                                    <div class="control">
                                        <input class="input" type="text" placeholder="enter Dosage"  onChange={e => setDosage(e.target.value)}/>
                                    </div>
                                </div>

                                <div class="field">
                                    <label class="label">Instructions</label>
                                    <div class="control">
                                        <input class="input" type="text" placeholder="enter Instructions" onChange={e => setInstructions(e.target.value)}/>
                                    </div>
                                </div>

                                <div class="field">
                                    <label class="label">Treatment Method</label>
                                    <div class="control">
                                        <input class="input" type="text" placeholder="enter Treatment Method" onChange={e => setTreatmentMethod(e.target.value)}/>
                                    </div>
                                </div>
                                
                                
                 
                                {/* <button type="submit" className="btn btn-primary btn-block" onClick={problemInput}>Add Animal Problem</button> */}
                                <a class="button is-info" onClick={problemInput}>
                                    Add Animal Prescription
                                </a>
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

export default AddPrescriptionForm;