import React from 'react';
import { BrowserRouter, Route} from 'react-router-dom';
import SignIn from './components/SignIn';
import SignUp from './components/SignUp';
import Navbar from './components/Navbar';
import Home from './components/Home';
import CouresRegistration from "./components/CouresRegistration";
import ApproveRegistration from "./components/ApproveRegistration";
import GradesList from "./components/GradesList";
import ListOfStudents from "./components/ListOfStudents";
import ListOfLessons from "./components/ListOfLessons";
import StudentInfo from "./components/StudentInfo";





class App extends React.Component {
  render() {
    return (
      <div>
        <BrowserRouter>
          <Navbar />
            <Route exact path='/home' component={Home} />
            <Route path='/signin' component={SignIn} />
            <Route path='/signup' component={SignUp} />
            <Route path='/courseRegistration' component={CouresRegistration} />
            <Route path='/approveRegistration' component={ApproveRegistration} />
          <Route path='/gradeList' component={GradesList} />
          <Route path='/listOfLessons' component={ListOfLessons} />
          <Route path='/listOfStudent' component={ListOfStudents} />
          <Route path='/studentInfo' component={StudentInfo} />


          
        </BrowserRouter>
      </div>
    );
  }
}

export default App;