package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LinkdroptriangleDark: ImageVector
    get() {
        if (_LinkdroptriangleDark != null) return _LinkdroptriangleDark!!

        _LinkdroptriangleDark = ImageVector.Builder(
            name = "LinkdroptriangleDark",
            defaultWidth = 14.0.dp,
            defaultHeight = 14.0.dp,
            viewportWidth = 14.0f,
            viewportHeight = 14.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 5f)
                curveTo(9.75f, 4.62f, 10.25f, 4.62f, 10.57f, 4.93f)
                curveTo(10.88f, 5.25f, 10.88f, 5.75f, 10.57f, 6.07f)
                lineTo(7f, 10f)
                lineTo(3f, 6f)
                curveTo(3.12f, 5.75f, 3.12f, 5.25f, 3.43f, 4.93f)
                curveTo(3.75f, 4.62f, 4.25f, 4.62f, 4.57f, 4.93f)
                lineTo(7f, 7f)
                lineTo(9f, 5f)
                close()
            }
        }.build()

        return _LinkdroptriangleDark!!
    }

private var _LinkdroptriangleDark: ImageVector? = null

