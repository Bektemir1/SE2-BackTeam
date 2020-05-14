import React from 'react';
import avatar from '../../logo.png';
import './Header.css';

const Header = ()=>{
    return(
        <div className=" header d-flex align-items-center">
            <img className="avatar" src={avatar} alt="logo"/>
            <h1 className="title">Teacher Information System</h1>
            <div className="header-line"></div>
        </div>
    )
}
export default Header;