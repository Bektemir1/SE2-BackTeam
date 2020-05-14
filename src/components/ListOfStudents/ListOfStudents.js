import React, { Component } from 'react'
import './ListOfStudents.css';
import Header from "../Header";
import HomeNavbar from "../HomeNavbar";
import {Link} from "react-router-dom";

class ListOfStudents extends Component {
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

                        <h2>List of students</h2>
                        <table class="table table-bordered">
                            <thead class="thead-light">
                                 <th>Name,Surname</th>
                                <th>Student Id</th>



                            </thead>
                            <tbody>
                            <tr>
                                  <td><Link to="studentInfo">Rapkat Baudunov</Link></td>
                                <td>180123012</td>

                            </tr>
                            <tr>
                                 <td><Link to="studentInfo">Bektemir</Link></td>
                                <td>1732432424</td>

                            </tr>

                            </tbody>

                        </table>

                        <button className="btn btn-primary floar-right">Send approve</button>
                        <button className="btn btn-primary floar-right">Send reject</button>
                    </div>


                </div>
            </div>
        )
    }
}

export default ListOfStudents
