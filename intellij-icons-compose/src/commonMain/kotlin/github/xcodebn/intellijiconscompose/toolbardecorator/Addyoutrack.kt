package github.xcodebn.intellijiconscompose.toolbardecorator

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Addyoutrack: ImageVector
    get() {
        if (_Addyoutrack != null) return _Addyoutrack!!

        _Addyoutrack = ImageVector.Builder(
            name = "Addyoutrack",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 16f)
                lineTo(9f, 14f)
                lineTo(7f, 11f)
                lineTo(8f, 11f)
                lineTo(9f, 13f)
                lineTo(11f, 11f)
                lineTo(12f, 11f)
                lineTo(10f, 14f)
                lineTo(10f, 16f)
                lineTo(9f, 16f)
                close()
                moveTo(14f, 16f)
                lineTo(14f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 11f)
                lineTo(16f, 11f)
                lineTo(16f, 12f)
                lineTo(14f, 12f)
                lineTo(14f, 16f)
                lineTo(14f, 16f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(9f, 16f)
                    lineTo(9f, 14f)
                    lineTo(7f, 11f)
                    lineTo(8f, 11f)
                    lineTo(9f, 13f)
                    lineTo(11f, 11f)
                    lineTo(12f, 11f)
                    lineTo(10f, 14f)
                    lineTo(10f, 16f)
                    lineTo(9f, 16f)
                    close()
                    moveTo(14f, 16f)
                    lineTo(14f, 12f)
                    lineTo(12f, 12f)
                    lineTo(12f, 11f)
                    lineTo(16f, 11f)
                    lineTo(16f, 12f)
                    lineTo(14f, 12f)
                    lineTo(14f, 16f)
                    lineTo(14f, 16f)
                    close()
                }
            }
        }.build()

        return _Addyoutrack!!
    }

private var _Addyoutrack: ImageVector? = null

