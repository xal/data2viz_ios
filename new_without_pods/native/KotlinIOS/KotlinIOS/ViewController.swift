//
//  ViewController.swift
//  KotlinIOS
//
//  Created by Evgeny Petrenko on 26.09.18.
//  Copyright © 2018 Evgeny Petrenko. All rights reserved.
//

import UIKit
import SharedCode





class ViewController: UIViewController {
    let tile = Draw(frame: CGRect(x: 0, y: 200, width: 400, height: 50))
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        self.view.addSubview(tile)
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    @IBAction func Pressed(sender: AnyObject) {
        tile.setNeedsDisplay()
        
    }
    
  

//    override func viewDidLoad() {
//        super.viewDidLoad()
//
//        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
//        label.center = CGPoint(x: 160, y: 285)
//        label.textAlignment = .center
//        label.font = label.font.withSize(25)
//        label.text = CommonKt.createApplicationScreenMessage()
//        view.addSubview(label)
//    }
    
    
//
//
//    override func draw(_ rect: CGRect) {
//
//        let r = CGRect(x: 5, y: 5, width: 10, height: 10)
//
//        UIColor.yellow.set()
//        UIRectFill(r)
//    }

}

class Draw: UIView {
    
    override func draw(_ rect: CGRect) {
        

        

        let rectangle = CGRect(x: 0, y: 0, width: 300, height: 300)
        let context = UIGraphicsGetCurrentContext();
        context?.setFillColor(red: 1.0, green: 0.0, blue: 0.0, alpha: 1.0)
        context?.setStrokeColor(red: 1.0, green: 0.0, blue: 0.0, alpha: 1.0)

        context?.fill(rectangle);
        
    
        IOSCanvasRenderer(viz: IOSRenderingTestSupportKt.rectViz().viz).render()

      
//        IOSRenderingTestSupportK
        
    }
}

