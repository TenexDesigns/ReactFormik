FORMIK COMPONENTS

formik
Form
Field
Eoormessage


In the provided code, you have already implemented form handling and validation using Formik and Yup in a Next.js application. However, there's a minor issue with rendering the error messages. You can fix that issue by wrapping the `ErrorMessage` component within a `div` element or any other HTML container. Here's your code with the necessary correction:

```jsx
import { Formik, Form, Field, ErrorMessage } from 'formik';
import * as Yup from 'yup';

function Youtubeform() {
  const onSubmit = (values) => {
    console.log('Form data', values);
  };

  const initialValues = {
    name: '',
    email: '',
    channel: '',
    comments: '',
  };

  const validationSchema = Yup.object({
    name: Yup.string().required('Required from validation schema'),
    email: Yup.string().email('Invalid email format').required('Required'),
    channel: Yup.string().required('Required'),
    comments: Yup.string(),
  });

  return (
    <Formik
      initialValues={initialValues}
      validationSchema={validationSchema}
      onSubmit={onSubmit}
    >
      <Form>
        <div>
          <label htmlFor="name">Name</label>
          <Field type="text" id="name" name="name" />
          <div className="error">
            <ErrorMessage name="name" />
          </div>
          <br />
        </div>

        <div>
          <label htmlFor="email">Email</label>
          <Field type="email" id="email" name="email" />
          <div className="error">
            <ErrorMessage name="email" />
          </div>
          <br />
        </div>

        <div>
          <label htmlFor="channel">Channel</label>
          <Field type="text" id="channel" name="channel" />
          <div className="error">
            <ErrorMessage name="channel" />
          </div>
          <br />
        </div>

        <div>
          <label htmlFor="comments">Comments</label>
          <Field as="textarea" type="text" id="comments" name="comments" />
          <div className="error">
            <ErrorMessage name="comments" />
          </div>
          <br />
        </div>

        <button type="submit">Submit</button>
      </Form>
    </Formik>
  );
}

export default Youtubeform;
```

In the updated code, I've wrapped the `ErrorMessage` component within a `div` element with a class of "error" to ensure that error messages are displayed properly.

Make sure to add appropriate CSS styles for the error messages to make them visually noticeable to users.





