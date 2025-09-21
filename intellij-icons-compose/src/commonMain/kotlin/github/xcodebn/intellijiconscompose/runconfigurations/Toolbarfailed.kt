package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolbarfailed: ImageVector
    get() {
        if (_Toolbarfailed != null) return _Toolbarfailed!!

        _Toolbarfailed = ImageVector.Builder(
            name = "Toolbarfailed",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFEDA200)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 8f)
                lineTo(12f, 5f)
                lineTo(11f, 4f)
                lineTo(8f, 7f)
                lineTo(5f, 4f)
                lineTo(4f, 5f)
                lineTo(7f, 8f)
                lineTo(4f, 11f)
                lineTo(5f, 12f)
                lineTo(8f, 9f)
                lineTo(11f, 12f)
                lineTo(12f, 11f)
                lineTo(9f, 8f)
                close()
                moveTo(8f, 14f)
                curveTo(4.41f, 14.50f, 1.50f, 11.59f, 1.50f, 8.00f)
                curveTo(1.50f, 4.41f, 4.41f, 1.50f, 8.00f, 1.50f)
                curveTo(11.59f, 1.50f, 14.50f, 4.41f, 14.50f, 8.00f)
                curveTo(14.50f, 11.59f, 11.59f, 14.50f, 8.00f, 14.50f)
                close()
            }
        }.build()

        return _Toolbarfailed!!
    }

private var _Toolbarfailed: ImageVector? = null

