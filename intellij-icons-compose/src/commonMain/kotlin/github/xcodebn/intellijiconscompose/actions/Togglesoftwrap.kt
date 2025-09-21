package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Togglesoftwrap: ImageVector
    get() {
        if (_Togglesoftwrap != null) return _Togglesoftwrap!!

        _Togglesoftwrap = ImageVector.Builder(
            name = "Togglesoftwrap",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(11f, 7f)
                lineTo(12f, 7f)
                curveTo(13.43f, 7.00f, 15.00f, 8.57f, 15.00f, 10.50f)
                curveTo(15.00f, 12.43f, 13.43f, 14.00f, 11.50f, 14.00f)
                lineTo(11f, 14f)
                lineTo(11f, 12f)
                lineTo(12f, 12f)
                curveTo(12.33f, 12.00f, 13.00f, 11.33f, 13.00f, 10.50f)
                curveTo(13.00f, 9.67f, 12.33f, 9.00f, 11.50f, 9.00f)
                lineTo(11f, 9f)
                lineTo(11f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(10f, 10f)
                lineTo(10f, 16f)
                lineTo(7f, 13f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(11f, 7f)
                    lineTo(12f, 7f)
                    curveTo(13.43f, 7.00f, 15.00f, 8.57f, 15.00f, 10.50f)
                    curveTo(15.00f, 12.43f, 13.43f, 14.00f, 11.50f, 14.00f)
                    lineTo(11f, 14f)
                    lineTo(11f, 12f)
                    lineTo(12f, 12f)
                    curveTo(12.33f, 12.00f, 13.00f, 11.33f, 13.00f, 10.50f)
                    curveTo(13.00f, 9.67f, 12.33f, 9.00f, 11.50f, 9.00f)
                    lineTo(11f, 9f)
                    lineTo(11f, 7f)
                    close()
                }
            }
        }.build()

        return _Togglesoftwrap!!
    }

private var _Togglesoftwrap: ImageVector? = null

