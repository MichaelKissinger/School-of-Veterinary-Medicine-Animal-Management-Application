import React, { Component, useEffect, useState, useRef } from "react";
import "bulma/css/bulma.css"
// import AnimalService from "../service/AnimalService";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";
import AddHistoryForm from "./AddHistoryForm";


export default class AnimalAddHistory extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id:this.props.match.params.id,
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
            <div class="rows">
                <div class="row">
                    <AddHistoryForm id={this.state.id}/>

                </div>
                <br></br>
                <br></br>
                <div class="row">    
                    <Link to={"/AnimalProfile/" + this.state.id} className="btn btn-primary">Back to Animal Profile</Link>
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