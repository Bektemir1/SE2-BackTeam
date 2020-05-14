import React, { Component } from 'react'

export class Dashboard extends Component {
    render() {
        return (
            <div >
                <h2 >Home page</h2>
                <table class="table table-bordered">

                    <tbody>
                        <tr>
                            <th scope="row">Teacher id</th>
                            <td>1366</td>

                        </tr>
                        <tr>
                            <th scope="row">Name,Surname</th>
                            <td>Burul Shambetova</td>

                        </tr>
                        <tr>
                            <th scope="row">Birth Date</th>
                            <td>12.03.1985</td>

                        </tr>
                        <tr>
                            <th scope="row">Status</th>
                            <td>Active</td>

                        </tr>
                        <tr>
                            <th scope="row">Email</th>
                            <td>burulshambetova@gmail.com</td>

                        </tr>
                       </tbody>
                </table>

            </div>
        )
    }
}

export default Dashboard
