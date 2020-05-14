import React, { Component } from 'react'
import './ListOfLessons.css';
import Header from "../Header";
import HomeNavbar from "../HomeNavbar";

class ListOfLessons extends Component {
    render() {
        return (
            <div>
                <div>
                    <Header/>

                </div>
                <div className="approveRegistration">

                    <div className="homeNavbar">

                        <HomeNavbar/>
                    </div>

                    <div className="Student">

                        <h2>List of lessons</h2>
                        <table class="table table-bordered">
                            <thead class="thead-light">
                            <tr>
                                <th>№</th>
                                <th>course code</th>
                                <th>name</th>
                                <th>hours</th>


                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>1</td>
                                <td>COM 108</td>
                                <td>Engineering Computer Graphics</td>
                                <td>6</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>COM 202</td>
                                <td>Data Structures</td>
                                <td>4</td>
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

export default ListOfLessons
