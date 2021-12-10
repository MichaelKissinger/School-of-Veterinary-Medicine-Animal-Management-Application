import React, { Component } from "react";
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


export default class AnimalProfile extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id:this.props.match.params.id,
            // id: 1,
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
                    <AnimalName/>
                <div class="rows">
                        <div class="row">
                            <AnimalPhoto/>
                        </div>
                        <h3 class="title is-3">Animal Status</h3>
                        <div class="row">
                            <AnimalStatus/>
                        </div>
                        <h3 class="title is-3">Animal Information</h3>
                        <div class="row">
                            <InfoTable value={this.state.id}/>
                        </div>
                        <h3 class="title is-3">Animal Problems</h3>
                        <div class="row">
                            <AnimalProblems/>
                        </div>
                        <h3 class="title is-3">Animal Prescriptions</h3>
                        <div class="row">
                            <AnimalPrescription/>
                        </div>
                        <h3 class="title is-3">Animal History</h3>
                        <div class="row">
                            <AnimalHistory/>
                        </div>
                        <h3 class="title is-3">Animal Comments</h3>
                        <div class="row">
                            <AnimalComments/>
                        </div>

                </div>
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