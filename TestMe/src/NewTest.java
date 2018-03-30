
import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.ec2.model.AmazonEC2Exception;
import com.amazonaws.services.ec2.model.CreateSecurityGroupRequest;
import com.amazonaws.services.ec2.model.CreateSecurityGroupResult;
import com.amazonaws.services.ec2.model.DescribeInstancesRequest;
import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.InstanceState;


public class NewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("aws.accessKeyId", "AKIAIC7TKJPGYBHWWJOQ_TTTTTTT");
		System.setProperty("aws.secretKey", "SvPpCqv2MWMtcT8Pz2FCwlqj1Y+KSMHQwmt8EtwL");
		
		 @SuppressWarnings("deprecation")
		AmazonS3 s3Client = new AmazonS3Client();
		 
		 
		 
		 AWSCredentials credentials = null;
	        try {
	           
	            
	            credentials = new BasicAWSCredentials("AKIAI7EPPBQANOM3HIHA_TTTTTT", "rApL3S4f/ccarjCMMgzKDNx+62pMj6AKW04aqPNT");
	        	//credentials = new BasicAWSCredentials("AKIAI7EPPBQANOM3HIHA", "rApL3S4f/ccarjCMMgzKDNx+62pMj6AKW04aqPNT");
	            		
	        } catch (Exception e) {
	            throw new AmazonClientException(
	                    "Cannot load the credentials from the credential profiles file. " +
	                    "Please make sure that your credentials file is at the correct " +
	                    "location (C:\\Users\\vikas\\.aws\\credentials), and is in valid format.",
	                    e);
	        }
	        
	        System.out.println(credentials.toString());
	        
	        AmazonEC2 ec2 = AmazonEC2ClientBuilder.standard()
	                .withCredentials(new AWSStaticCredentialsProvider(credentials))
	                .withRegion("us-west-2")
	                .build();

	        System.out.println(ec2.toString());
	       
	        
	        
		    //InstanceState state = describeInstanceResult.getReservations().get(0).getInstances().get(0).getState();
		    
		    
	        	
	        System.out.println("Instance Created Or Not : " +  Boolean.toString(getInstanceStatus(ec2)));
	        	
	}
	
	public static  boolean getInstanceStatus(AmazonEC2 ec2Obj) 
	{
		
		boolean ec2CallStatus = false;
		try {
	    DescribeInstancesRequest describeInstanceRequest = new DescribeInstancesRequest();
	    DescribeInstancesResult describeInstanceResult = ec2Obj.describeInstances(describeInstanceRequest);
	    ec2CallStatus = true;
		} catch (AmazonEC2Exception e){
			//e.printStackTrace();
			ec2CallStatus = false;
		}
		catch(Exception exp)
		{
			ec2CallStatus = false;
		}
	    
	    return ec2CallStatus;
	}

}
