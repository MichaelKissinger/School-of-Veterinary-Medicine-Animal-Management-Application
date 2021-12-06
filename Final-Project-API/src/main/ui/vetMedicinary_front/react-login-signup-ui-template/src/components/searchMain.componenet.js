import React, { Component } from "react";

export default class SearchMain extends Component {
    constructor(props) {
        super(props);
        this.state = {
            date: new Date().toLocaleString()
        };
    }
    render() {
        return (
            <form class="main-search">
                <header>
                    <div class="search-header-container blog-main-clear">
                        <div class="search-header-date-container">
                            <div class="header-date-inner">{this.state.date}</div>
                        </div>
                    </div>
                </header>
                <div class="search-container">
                    <table class="table table-responsive">
                        <tbody>
                            <tr>
                                <td><input class="form-control mr-sm-2" type="search" placeholder="ID" /></td>
                                <td><input class="form-control mr-sm-2" type="search" placeholder="Name" /></td>
                                <td><input class="form-control mr-sm-2" type="search" placeholder="Breed" /></td>
                                <td><input class="form-control mr-sm-2" type="search" placeholder="Color" /></td>
                                <td><input class="form-control mr-sm-2" type="search" placeholder="Birthday" /></td>
                                <td><input class="form-control mr-sm-2" type="search" placeholder="Owner" /></td>
                                <td><button class="btn btn-outline-primary" type="submit">Search</button></td>
                            </tr>
                        </tbody>
                    </table>
                    <table class="table table-responsive table-striped table-hover">
                        <thead>
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Type</th>
                                <th scope="col">Name</th>
                                <th scope="col">bread</th>
                                <th scope="col">Color</th>
                                <th scope="col">Birthday</th>
                                <th scope="col">Owner</th>
                                <th scope="col">Details</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th scope="row">1</th>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td>German Shepherd</td>
                                <td>Brown - Black</td>
                                <td>23-01-2018</td>
                                <td>The Owner</td>
                                <td><a class="fa fa-folder-open" href="#"></a></td>

                            </tr>
                            <tr>
                                <th scope="row">2</th>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>Tibetan Mastiff</td>
                                <td>White</td>
                                <td>2018-11-10</td>
                                <td>The Owner</td>
                                <td><a class="fa fa-folder-open" href="#"></a></td>
                            </tr>
                            <tr>
                                <th scope="row">3</th>
                                <td>Larry</td>
                                <td>the Bird</td>
                                <td>Siberian Husky</td>
                                <td>Gray</td>
                                <td>2018-11-10</td>
                                <td>The Owner</td>
                                <td><a class="fa fa-folder-open" href="#"></a></td>
                            </tr>
                            <tr>
                                <th scope="row">4</th>
                                <td>Larry</td>
                                <td>the Bird</td>
                                <td>Siberian Husky</td>
                                <td>Khaki</td>
                                <td>2018-11-10</td>
                                <td>The Owner</td>
                                <td><a class="fa fa-folder-open" href="#"></a></td>
                            </tr>
                            <tr>
                                <th scope="row">5</th>
                                <td>Larry</td>
                                <td>the Bird</td>
                                <td>Siberian Husky</td>
                                <td>Gray</td>
                                <td>2018-11-10</td>
                                <td>The Owner</td>
                                <td><a class="fa fa-folder-open" href="#"></a></td>
                            </tr>
                            <tr>
                                <th scope="row">6</th>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td>German Shepherd</td>
                                <td>Brown - Black</td>
                                <td>2018-11-10</td>
                                <td>The Owner</td>
                                <td><a class="fa fa-folder-open" href="#"></a></td>
                            </tr>
                            <tr>
                                <th scope="row">7</th>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>Tibetan Mastiff</td>
                                <td>White</td>
                                <td>2018-11-10</td>
                                <td>The Owner</td>
                                <td><a class="fa fa-folder-open" href="#"></a></td>
                            </tr>
                            <tr>
                                <th scope="row">8</th>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>Tibetan Mastiff</td>
                                <td>White</td>
                                <td>2018-11-10</td>
                                <td>The Owner</td>
                                <td><a class="fa fa-folder-open" href="#"></a></td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="search-pagination">
                    <nav aria-label="Page navigation example">
                        <ul class="pagination justify-content-end">
                            <li class="page-item disabled">
                                <a class="page-link" href="#" tabindex="-1">Previous</a>
                            </li>
                            <li class="page-item">
                                <a class="page-link" href="#">Next</a>
                            </li>
                        </ul>
                    </nav>
                    </div>
                </div>

                <footer>
                    <div class="search-footer-container">
                    <p class="footer-address-inner">School of Veterinary Medicine 
                                            </p>
                    </div>
                </footer>
            </form >
        );
    }
}