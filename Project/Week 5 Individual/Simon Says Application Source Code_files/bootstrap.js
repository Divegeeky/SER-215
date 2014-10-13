
(function(){var run_safe,trigger,universal_trigger_token,validate,settings,control;if(!this.__compete_code_control){this.__compete_code_control={};}
control=this.__compete_code_control;control.synchronous=false;universal_trigger_token="*";validate=function(sites){var hostname,hostname_length,site,_i,_len,tokens=[];if(sites==null){return false;}
hostname=window.location.hostname.toLowerCase();hostname_length=hostname.length;for(_i=0,_len=sites.length;_i<_len;_i++){site=sites[_i];if((site===universal_trigger_token)||(site===hostname)||(hostname.slice(-(site.length+1))===("."+site))){control.token=tokens[_i];return true;}}
return false;};run_safe=function(action,control){try{action.call(window,control);}catch(err){if(typeof console!="undefined"&&console!==null){if(typeof console.error=="function"){console.error(err);}}}};trigger=function(sites,action){if(!(sites&&action)){return null;}
if(validate(sites)){run_safe(action,control);}};}).call(this);