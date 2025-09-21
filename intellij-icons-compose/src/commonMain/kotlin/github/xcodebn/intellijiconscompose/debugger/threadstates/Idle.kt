package github.xcodebn.intellijiconscompose.debugger.threadstates

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Idle: ImageVector
    get() {
        if (_Idle != null) return _Idle!!

        _Idle = ImageVector.Builder(
            name = "Idle",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF59A869)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 15f)
                curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
                curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                close()
                moveTo(12f, 4f)
                lineTo(6f, 9f)
                lineTo(4f, 7f)
                lineTo(3f, 8f)
                lineTo(6f, 11f)
                lineTo(13f, 5f)
                lineTo(12f, 4f)
                close()
            }
        }.build()

        return _Idle!!
    }

private var _Idle: ImageVector? = null

