onst fs = require('fs');
const path = require('path');
/*fs.writeFile(path.join(__dirname,'/training details','/student.txt')
,'anirudh'
   ,'My text file contains'
   ,(err)=>{
    if(err) throw err;
    console.log('File written to...');
})*/

fs.readFile(path.join(__dirname,'/training details','/student.txt'),'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
})