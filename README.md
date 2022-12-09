# AWS Lambda SnapStart [![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fnumerica-ideas%2Faws-lambda-snapstart&count_bg=%2379C83D&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=hits&edge_flat=false)](https://blog.numericaideas.com)

This project contains source code and supporting files for a serverless application that you can deploy with the [SAM CLI](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/what-is-sam.html).

There we have activated **SnapStart** from the `template.yml` files

## Stacks

- Java
- SpringBoot

## Deploy

To build and deploy your application for the first time, run the following in your shell:

```bash
sam build
sam deploy --guided
```

## Run

After deployement done, SAM CLI will print out the stack's output, including the new application URL. You can use `curl` or open the URL from a browser.

```bash
curl https://xxxxxxxx.execute-api.us-east-1.amazonaws.com/hello
```

## SnapStart : activating & testing

To active and test it, the following configuration must be added in `template.yml` file.

```
...
NISnapStartDemoFunction:
    Type: AWS::Serverless::Function
    Properties:
      ....
      AutoPublishAlias: live
      SnapStart: 
        ApplyOn: PublishedVersions
      ...
```

After this you have to build and deploy again;

Then you can run function with SnapStart enabled;

## Author

[NI Network](https://www.numericaideas.com/)
