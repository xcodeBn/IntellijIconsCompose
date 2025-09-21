package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Restart: ImageVector
    get() {
        if (_Restart != null) return _Restart!!

        _Restart = ImageVector.Builder(
            name = "Restart",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(8f, 15f)
                lineTo(8f, 15f)
                curveTo(4.46f, 15.00f, 2.00f, 12.54f, 2.00f, 9.50f)
                curveTo(2.00f, 6.46f, 4.46f, 4.00f, 7.50f, 4.00f)
                lineTo(11f, 4f)
                lineTo(11f, 6f)
                lineTo(8f, 6f)
                curveTo(5.57f, 6.00f, 4.00f, 7.57f, 4.00f, 9.50f)
                curveTo(4.00f, 11.43f, 5.57f, 13.00f, 7.50f, 13.00f)
                lineTo(8f, 13f)
                lineTo(8f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(10f, 1f)
                lineTo(16f, 5f)
                lineTo(10f, 9f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF59A869))
                ) {
                    moveTo(8f, 15f)
                    lineTo(8f, 15f)
                    curveTo(4.46f, 15.00f, 2.00f, 12.54f, 2.00f, 9.50f)
                    curveTo(2.00f, 6.46f, 4.46f, 4.00f, 7.50f, 4.00f)
                    lineTo(11f, 4f)
                    lineTo(11f, 6f)
                    lineTo(8f, 6f)
                    curveTo(5.57f, 6.00f, 4.00f, 7.57f, 4.00f, 9.50f)
                    curveTo(4.00f, 11.43f, 5.57f, 13.00f, 7.50f, 13.00f)
                    lineTo(8f, 13f)
                    lineTo(8f, 15f)
                    close()
                }
            }
        }.build()

        return _Restart!!
    }

private var _Restart: ImageVector? = null

