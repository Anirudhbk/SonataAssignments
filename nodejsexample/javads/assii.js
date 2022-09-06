const fs = require('fs');
const path = require('path');
/*fs.writeFile(path.join(__dirname,'/trainingdetails','/student.txt')
   ,'anirudh'
   ,(err)=>{
    if(err) throw err;
    console.log('File written to...');
})*/

fs.readFile(path.join(__dirname,'/demu.java'),'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
})