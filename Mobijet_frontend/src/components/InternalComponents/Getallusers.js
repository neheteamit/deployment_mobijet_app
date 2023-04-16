import { useEffect, useState } from "react";
import { Navbar, Nav, NavDropdown } from 'react-bootstrap'
import { Link, Routes, Route } from "react-router-dom";
import { useNavigate } from 'react-router-dom';
import axios from 'axios';

const init = {
  userid:"",
  flag:""

}
let check="";

const reducer = (state, action) => {
  switch (action.type) {
      case 'update':
          return { ...state, [action.field]: action.val };
      case 'clear':
          return init;
  }
}

function Getallusers() {
  let navigate = useNavigate();

  const [images, setImage] = useState([]);
   const [product,setProduct]=useState([]);
  const logout = () => {
    localStorage.clear();
    navigate("/login")
  };

  const getuserid=(uidd)=>{
    let uid=parseInt(uidd);
    let set="";
    console.log(parseInt(uid));
    console.log(uidd[4]);
    if(uidd[4]=="f")
    {
      set =true;
    }else if(uidd[4]=="t")
    {
      set =false;
    }

  
    
    axios
    .post("http://localhost:8080/changestatus?status="+set+"&uid="+uid)
    .then(resp=>{
      console.log(resp.data);
      if(resp.data!==null){
      navigate("/getallusers");
      window.location.reload();
      }
  });
 };
 
 const deleteuser=(userid)=>{
  console.log(userid) ;
  axios
  .post("http://localhost:8080/deleteuser?uid="+userid)
  .then(resp=>{
    console.log(resp.data)
    if(resp.data!=null){
      navigate("/getallusers");
      window.location.reload();
    }
  })

 };
  const deleteproduct=(pid)=>{
    console.log(pid);
    axios
    .post("http://localhost:8080/deleteproduct?pid="+pid)
    .then(resp=>{
      console.log(resp.data)
      if(resp.data!=null){
        navigate("/getallusers");
        window.location.reload();
      }
    })
  };
  

  const [user, setUser] = useState({});
  useEffect(() => {

      fetch("http://localhost:8080/getallUser")
      .then(resp => resp.json())
      .then(data => setImage(data))
      console.log(images);

      
      fetch("http://localhost:8080/getallproducts")
      .then(resp => resp.json())
      .then(data => setProduct(data))
      console.log(product);

    //let nm= (JSON.parse(localStorage.getItem("loggedincust"))).fname;
  }, []);



  return (
    <div style={{backgroundColor:'#E3F3EB',height:'1300px'}}>
      
         <Navbar bg="dark" variant="dark">
        <Navbar.Brand href="/home">MobiJet</Navbar.Brand>
        <Nav className="mr-auto navbar_wrapper">

          localStorage.getItem("loggedinuser")
              <>
    
          </>


        </Nav>
        <Nav>
          <NavDropdown title={user.fname}>
            <NavDropdown.Item onClick={logout}>Logout</NavDropdown.Item>
          </NavDropdown>
        </Nav>
  </Navbar>
 
 <div>
 <h1>Mobijet Users</h1>
  <table align="center" border="2" ali>
    {images.map((e)=>{
          {/* check=JSON.stringify(e.uid.status); */}
      return(
        <tr style={{ border: 3, bordercolor: "black" }}>
          <td value={e.userid} >Userid:{e.userid} </td>
          <td  >First name:{e.fname} </td>
          <td >Last Name:{e.lname} </td>
          <td  >Role:{e.uid.role} </td>
          <td id="check" style={{paddingRight:'80px'} }>Status:{JSON.stringify(e.uid.status)} </td>

          <td>  <button  id ="bt" key={e.uid.uid} value={[e.uid.uid,e.uid.status]} onClick={(e)=>{getuserid(e.target.value) } } >Change status</button></td>
          <td>  <button key={e.uid.uid} value={e.uid.uid} onClick={(e)=>{deleteuser(e.target.value)}}>Remove</button></td>
        </tr>
      )
    })}
        </table>
        </div>
        <div>
          <h1>MobiJet Products</h1>
          <table  align="center" border="2">
          {product.map((e)=>{
            return( 
                <tr>
                  <td value={e.pid} border="2" >ID:{e.pid}</td>
                  <td>Name:{e.company}</td>
                  <td>Price:{e.price}</td>
                  <td> Picture : <img src={`data:image/png;base64,${e.image}`} width="150" height="150" /></td>
                  <td>  <button key={e.pid} value={e.pid} onClick={(e)=>{deleteproduct(e.target.value)}}>Remove Product</button></td>
                </tr>
             
            )
     
       })}
          </table>
        </div>
        

          
           </div>  
  );
}

export default Getallusers;