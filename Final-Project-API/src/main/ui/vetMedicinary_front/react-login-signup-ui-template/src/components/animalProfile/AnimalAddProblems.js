import React, { Component, useEffect, useState, useRef } from "react";
import InfoTable from "./InfoTable"
import AnimalPhoto from "./AnimalPhotos";
import AnimalProblems from "./AnimalProblems";
import AnimalHistory from "./AnimalHistory";
import AnimalPrescription from "./AnimalPrescription";
import AnimalComments from "./AnimalComment";
import "bulma/css/bulma.css"
// import AnimalService from "../service/AnimalService";
import AnimalName from "./AnimalName"
import AnimalStatus from "./AnimalStatus";
import axios from "axios";
import AddProblemForm from "./AddProblemForm";


export default class AnimalAddProblem extends Component {
    constructor(props) {
        super(props);
        this.state = {
            date: new Date().toLocaleString()
        };
    }

    
    render() {
        return (
            <form class="animal-profile">
                {/* <header>
                    <div class="search-header-container blog-main-clear">
                        <div class="search-header-date-container">
                            <div class="header-date-inner">{this.state.date}</div>
                        </div>
                    </div>
                </header> */}
                            <AddProblemForm/>
                {/* <footer>
                    <div class="search-footer-container">
                    <p class="footer-address-inner">School of Veterinary Medicine 
                                            </p>
                    </div>
                </footer> */}
            </form >
        );
    }
}