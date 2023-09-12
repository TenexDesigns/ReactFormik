To receive nested values as an array in Formik, you can use the bracket notation in the `name` attribute of the `Field` component. The `name` attribute in Formik can use lodash-like dot paths to reference nested Formik values. Therefore, you do not need to flatten your form's values anymore. 

For instance, if you have an array of phone numbers in your `initialValues` like this:

```javascript
const initialValues = {
  name: '',
  email: '',
  channel: '',
  comments: '',
  phoneNumbers: ['', '']
};
```

You can access these phone numbers in your form fields as follows:

```javascript
<Field type="text" name="phoneNumbers[0]" />
<Field type="text" name="phoneNumbers[1]" />
```

Here is how you can modify your example to include the phone numbers:

```javascript
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
    phoneNumbers: ['', '']
  };

  const validationSchema = Yup.object({
    name: Yup.string().required('Required from validation schema'),
    email: Yup.string().email('Invalid email format').required('Required'),
    channel: Yup.string().required('Required'),
    comments: Yup.string(),
    phoneNumbers: Yup.array().of(Yup.string())
  });

  return (
    <Formik
      initialValues={initialValues}
      validationSchema={validationSchema}
      onSubmit={onSubmit}
    >
      <Form>
        {/* Other fields... */}

        <div>
          <label htmlFor="phoneNumbers[0]">Primary Phone Number</label>
          <Field type="text" id="phoneNumbers[0]" name="phoneNumbers[0]" />
          <div className="error">
            <ErrorMessage name="phoneNumbers[0]" />
          </div>
          <br />
        </div>

        <div>
          <label htmlFor="phoneNumbers[1]">Secondary Phone Number</label>
          <Field type="text" id="phoneNumbers[1]" name="phoneNumbers[1]" />
          <div className="error">
            <ErrorMessage name="phoneNumbers[1]" />
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

In this updated form, we have two fields for phone numbers, each accessing an element in the `phoneNumbers` array through the `name` attribute. We also added a validation rule for `phoneNumbers` to ensure that it is an array of strings [Source 0](https://formik.org/docs/guides/arrays)[Source 2](https://formik.org/docs/api/fieldarray).
