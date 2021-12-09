import React, { Component } from "react";

export default class AdministratorAccess extends Component {
    constructor(props) {
        super(props);
        this.state = {
            date: new Date().toLocaleString()
        };
    }
    render() {
        return (
            <form class="admin-access-point">
                <header>
                    <div class="search-header-container blog-main-clear">
                        <div class="search-header-date-container">
                            <div class="header-date-inner">{this.state.date}</div>
                        </div>
                        <div class="sign-out">
                        <a class="sign-out fa fa-times" href="./Login" title="log out"></a>
                        </div>
                    </div>
                </header>
                <div class="admin-access-container row">
                    <div class="col-md-3">
                        <div class="card">
                            <h4 class="text-center bg-dark text-white-50">Administrator Access</h4>
                            <div class="card-body">
                                <div class="d-flex flex-column align-items-center text-center">
                                    <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin" class="rounded-circle" width="150" />
                                    <div class="mt-3">
                                        <table class="table table-responsive">
                                            <tbody>
                                                <tr>
                                                    <th scope="col">Name:</th>
                                                    <th scope="col"><strong><i>John</i></strong></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Family:</th>
                                                    <th scope="col"><strong><i>Smith</i></strong></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Birtdate:</th>
                                                    <th scope="col"><strong><i>1984-08-30</i></strong></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Type of Access:</th>
                                                    <th scope="col"><strong><i>Administrator</i></strong></th>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="card">
                            <h4 class="text-center bg-dark text-white-50">Animals List</h4>
                            <div class="card-body">
                                <div class="d-flex flex-column align-items-center text-center">
                                    <div class="mt-3">
                                        <table class="table table-responsive table-hover table-striped">
                                            <thead>
                                                <tr>
                                                    <th scope="col">Name</th>
                                                    <th scope="col">Comment</th>
                                                    <th scope="col">Detail</th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <th scope="col">Dog A</th>
                                                    <th scope="col"><a class="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-folder-open" href="#"></a></th>

                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat A</th>
                                                    <th scope="col"><a class="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-folder-open" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Kangaroo</th>
                                                    <th scope="col"><a class="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-folder-open" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Dog B</th>
                                                    <th scope="col"><a class="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-folder-open" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat B</th>
                                                    <th scope="col"><a class="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-folder-open" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat B</th>
                                                    <th scope="col"><a class="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-folder-open" href="#"></a></th>
                                                </tr>
                                                <tr>
                                                    <th scope="col">Cat B</th>
                                                    <th scope="col"><a class="fa fa-pencil" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-folder-open" href="#"></a></th>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-5">
                        <div class="card">
                            <h4 class="text-center bg-dark text-white-50">User's List</h4>
                            <div class="card-body">
                                <div class="d-flex flex-column align-items-center text-center">
                                    <div class="mt-3">
                                    <button type="button" class="btn btn-outline-primary">Add User</button>
                                        <table class="table table-responsive table-hover table-striped">
                                            <thead>
                                                <tr>
                                                    <th scope="col">First Name</th>
                                                    <th scope="col">Last Name</th>
                                                    <th scope="col">Edit</th>
                                                    <th scope="col">block</th>
                                                    {/* <th scope="col">Reset Password</th> */}
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <th scope="col">User Name</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a class="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                                <tr>
                                                    <th scope="col">Frank Puskas</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a class="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                                <tr>
                                                    <th scope="col">Jim Carrey</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a class="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                                <tr>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a class="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                                <tr>
                                                    <th scope="col">Frank Puskas</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a class="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                                <tr>
                                                    <th scope="col">Frank Puskas</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a class="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                                <tr>
                                                    <th scope="col">Frank Puskas</th>
                                                    <th scope="col">John Smith</th>
                                                    <th scope="col"><a class="fa fa-edit" href="#"></a></th>
                                                    <th scope="col"><a class="fa fa-times" href="#"></a></th>
                                                    {/* <th scope="col"><a class="fa fa-refresh" href="#"></a></th> */}
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
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