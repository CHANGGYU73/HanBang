// 공인 중개사 승인 
function updateAuthority(realTorCode){
    const result = confirm('승인 하시겠습니까?');
    if(result){
        location.href = `/admin/updateAuthority?realTorCode=${realTorCode}`;
    }
}


