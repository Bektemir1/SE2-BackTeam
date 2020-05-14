import React, { Component } from 'react'
import './StudentInfo.css';
import Header from "../Header";
import HomeNavbar from "../HomeNavbar";

class StudentInfo extends Component {
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

                        <h2>Student Information</h2>
                        <table class="table table-bordered">
                            <tbody>
                            <tr>
                                <th scope="row">Student № </th>
                                <td>1280123123</td>

                            </tr>
                            <tr>
                                <th scope="row">Name,Surname</th>
                                <td>Rapkat Baudunov</td>

                            </tr>
                            <tr>
                                <th scope="row">Father</th>
                                <td>Shauket</td>

                            </tr>
                            <tr>
                                <th scope="row">Birth Date</th>
                                <td>12.03.1985</td>

                            </tr>
                            <tr>
                                <th scope="row">Status</th>
                                <td>Studying</td>

                            </tr>
                            <tr>
                                <th scope="row">Email</th>
                                <td>burulshambetova@gmail.com</td>

                            </tr>
                            <tr>
                                <th scope="row">Program / Class </th>
                                <td>Информатика жана эсептөө техникасы - Бкл.-EN - 3</td>

                            </tr>
                            <tr>
                                <th scope="row">Advisor</th>
                                <td>Бурул Шамбетова</td>

                            </tr>
                            <tr>
                                <th scope="row">Grant type </th>
                                <td>Not available</td>

                            </tr>
                            </tbody>
                        </table>

                        <div className="Student">

                            <h2>Student Lectures</h2>
                            <table className="table table-bordered">
                                <thead className="thead-light">
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

                        </div>


                    </div>



                </div>

            </div>
        )
    }
}

export default StudentInfo
