package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Notificationerror: ImageVector
    get() {
        if (_Notificationerror != null) return _Notificationerror!!

        _Notificationerror = ImageVector.Builder(
            name = "Notificationerror",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFDB5860)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(6.48f, 22.00f, 2.00f, 17.52f, 2.00f, 12.00f)
                curveTo(2.00f, 6.48f, 6.48f, 2.00f, 12.00f, 2.00f)
                curveTo(17.52f, 2.00f, 22.00f, 6.48f, 22.00f, 12.00f)
                curveTo(22.00f, 17.52f, 17.52f, 22.00f, 12.00f, 22.00f)
                close()
                moveTo(10f, 5f)
                lineTo(10f, 13f)
                lineTo(14f, 13f)
                lineTo(14f, 5f)
                lineTo(10f, 5f)
                close()
                moveTo(10f, 15f)
                lineTo(10f, 18f)
                lineTo(14f, 18f)
                lineTo(14f, 15f)
                lineTo(10f, 15f)
                close()
            }
        }.build()

        return _Notificationerror!!
    }

private var _Notificationerror: ImageVector? = null

