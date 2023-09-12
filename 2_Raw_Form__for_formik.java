import { useFormik } from "formik"

function Youtubeform() {
  const formik = useFormik({
    initialValues:{
        name:'',
        email:'',
        channel:''
      }
    ,
    onSubmit:values => {
        console.log('Form data', values)
  
      },
    validate: values =>{
      // values.name values.email values.chnnel
      // errors.name erros.email erros.chaneel
      // erros.name = 'This field is required '



      let errors = {}

      if(!values.name){
        errors.name = 'Required'

      }else if(!/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/i.test(values.email)){
        errors.email ='Invalid email format'

      }
        

      if(!values.email){
        errors.email = 'Required'

      }

      if(!values.channel){
        errors.channel = 'Required'

      }


      return errors
    }


  })

  console.log('Visited fields', formik.touched)

  return (
    <div>
        youtubeform
        <form onSubmit={formik.handleSubmit}>
          <div>

       
            <label htmlFor="name">Name</label>
            <input type='text' id='name' name='name' onBlur={formik.handleBlur}  onChange={formik.handleChange} value={formik.values.name}/>
            { formik.touched.name && formik.errors.name?<div>{formik.errors.name}</div>:null}
            <br/>
            </div>

            <div>

        

            <label htmlFor="email">Email</label>
            <input type="email" id="email" name="email" onBlur={formik.handleBlur}  onChange={formik.handleChange} value={formik.values.email}/>
            { formik.touched.email && formik.errors.email?<div>{formik.errors.email}</div>:null}
           
            <br/>
            </div>

            <div>

          
<label htmlFor="channel">Channel</label>  
<input type="text" id="channel" name="channel" onBlur={formik.handleBlur} onChange={formik.handleChange} value={formik.values.channel}/> 
{formik.touched.channel && formik.errors.channel?<div>{formik.errors.channel}</div>:null}

<br/>
</div>


<button type="submit">Subbmit</button>

     </form>
        
        
        
        </div>
  )
}

export default Youtubeform
