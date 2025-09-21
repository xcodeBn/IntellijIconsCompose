package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Notificationwarning: ImageVector
    get() {
        if (_Notificationwarning != null) return _Notificationwarning!!

        _Notificationwarning = ImageVector.Builder(
            name = "Notificationwarning",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFEDA200)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                lineTo(23f, 21f)
                lineTo(1f, 21f)
                lineTo(12f, 2f)
                close()
                moveTo(14f, 19f)
                lineTo(14f, 16f)
                lineTo(10f, 16f)
                lineTo(10f, 19f)
                lineTo(14f, 19f)
                close()
                moveTo(14f, 14f)
                lineTo(14f, 8f)
                lineTo(10f, 8f)
                lineTo(10f, 14f)
                lineTo(14f, 14f)
                close()
            }
        }.build()

        return _Notificationwarning!!
    }

private var _Notificationwarning: ImageVector? = null

