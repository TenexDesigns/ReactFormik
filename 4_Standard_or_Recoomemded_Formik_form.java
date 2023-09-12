import {Formik, Form,Field,ErrorMessage} from "formik"
import * as Yup from 'yup'

function Youtubeform() {

  const onSubmit = values => {
    console.log('Form data', values)

  }

  const initialValues = {
    name:'',
    email:'',
    channel:'',
    comments:''
  }


  const validationSchema = Yup.object({
    name: Yup.string().required("Required from validation schema"),
    email: Yup.string().email("Invalid email format").required("Required"),
    channel: Yup.string().required("Required"),
    comments:Yup.string()
  })





  return (
    <Formik
    initialValues={initialValues}
    validationSchema ={validationSchema}
    onSubmit={onSubmit}

    >
      
        <Form >

          <div>       
            <label htmlFor="name">Name</label>
            <Field type='text' id='name' name='name' />
            <ErrorMessage name="name"/>
            <br/>
            </div>





            <div>
            <label htmlFor="email">Email</label>
            <Field type="email" id="email" name="email" />
            <ErrorMessage name="email"/>         
            <br/>
            </div>


            <div>          
            <label htmlFor="channel">Channel</label>  
            <Field type="text" id="channel" name="channel" /> 
            <ErrorMessage name="channel"/>
            <br/>
            </div>



            <div>          
            <label htmlFor="comments">Comments</label>  
            <Field as="textarea" type="text" id="comments" name="comments" /> 
            <ErrorMessage name="comments"/>
            <br/>
            </div>







             < button type="submit">Subbmit</button>

     </Form >
        
        
        
        </Formik>
  )
}

export default Youtubeform
