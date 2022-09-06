const fs = require('fs');
const path = require('path');
fs.writeFile(path.join(__dirname,'/test','/hello.txt')
   ,'My text file contains'
   ,(err)=>{
    if(err) throw err;
    console.log('File written to...');
}
)
