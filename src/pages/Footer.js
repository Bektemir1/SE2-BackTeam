import React, { Component } from 'react';
import {Link } from 'react-router-dom';

import { MDBFooter } from 'mdbreact';

class Footer extends Component {
    render() {
        return (
            <div>
                <MDBFooter>
                    <ul>
                        <li><Link to='/gradeslist'>Grades</Link></li>
                        <li><Link to='/schedule'>Schedule</Link></li>
                    </ul>
                </MDBFooter>

            </div>
        )
    }
}

export default Footer;
