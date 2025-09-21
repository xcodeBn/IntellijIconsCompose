package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inspectionserrorempty: ImageVector
    get() {
        if (_Inspectionserrorempty != null) return _Inspectionserrorempty!!

        _Inspectionserrorempty = ImageVector.Builder(
            name = "Inspectionserrorempty",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd,
                stroke = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(8f, 13f)
                curveTo(10.76f, 13.00f, 13.00f, 10.76f, 13.00f, 8.00f)
                curveTo(13.00f, 5.24f, 10.76f, 3.00f, 8.00f, 3.00f)
                curveTo(5.24f, 3.00f, 3.00f, 5.24f, 3.00f, 8.00f)
                curveTo(3.00f, 10.76f, 5.24f, 13.00f, 8.00f, 13.00f)
                close()
            }
        }.build()

        return _Inspectionserrorempty!!
    }

private var _Inspectionserrorempty: ImageVector? = null

