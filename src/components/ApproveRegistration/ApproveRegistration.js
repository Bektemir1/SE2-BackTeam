import React, { Component } from 'react'
import './ApproveRegistration.css';
import Header from "../Header";
import HomeNavbar from "../HomeNavbar";
import {Link} from "react-router-dom";

class ApproveRegistration extends Component {
    render() {
        return (
            <div className="ar">
            <div>
                <Header/>

            </div>
            <div className="approveRegistration">

                <div className="homeNavbar">

                <HomeNavbar/>
                </div>

                <div className="Student">

                <h2>Student Scheldule</h2>
                <table class="table table-bordered">
                    <thead class="thead-light">
                    <tr>
                        <th>Name,Surname</th>
                        <th>Status</th>


                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td><Link to= "listOfLessons">Rapkat Baudunov</Link></td>
                        <td>Approve</td>
                    </tr>
                    <tr>
                        <td><Link to= "listOfLessons">Damir Abdybap uulu</Link></td>
                        <td>Not Approve</td>
                    </tr>

                    </tbody>
                </table>
                </div>


            </div>
            </div>
        )
    }
}

export default ApproveRegistration
