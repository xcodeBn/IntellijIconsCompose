package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Profilememory: ImageVector
    get() {
        if (_Profilememory != null) return _Profilememory!!

        _Profilememory = ImageVector.Builder(
            name = "Profilememory",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 11f)
                lineTo(3f, 11f)
                lineTo(3f, 2f)
                lineTo(9f, 2f)
                lineTo(9f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(14f, 16f)
                lineTo(14f, 14f)
                lineTo(10f, 14f)
                lineTo(10f, 16f)
                lineTo(8f, 16f)
                lineTo(8f, 8f)
                lineTo(16f, 8f)
                lineTo(16f, 16f)
                lineTo(14f, 16f)
                close()
                moveTo(10f, 10f)
                lineTo(10f, 12f)
                lineTo(14f, 12f)
                lineTo(14f, 10f)
                lineTo(10f, 10f)
                close()
                moveTo(11f, 15f)
                lineTo(13f, 15f)
                lineTo(13f, 16f)
                lineTo(11f, 16f)
                lineTo(11f, 15f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(9f, 7f)
                    lineTo(7f, 7f)
                    lineTo(7f, 11f)
                    lineTo(3f, 11f)
                    lineTo(3f, 2f)
                    lineTo(9f, 2f)
                    lineTo(9f, 7f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(14f, 16f)
                    lineTo(14f, 14f)
                    lineTo(10f, 14f)
                    lineTo(10f, 16f)
                    lineTo(8f, 16f)
                    lineTo(8f, 8f)
                    lineTo(16f, 8f)
                    lineTo(16f, 16f)
                    lineTo(14f, 16f)
                    close()
                    moveTo(10f, 10f)
                    lineTo(10f, 12f)
                    lineTo(14f, 12f)
                    lineTo(14f, 10f)
                    lineTo(10f, 10f)
                    close()
                    moveTo(11f, 15f)
                    lineTo(13f, 15f)
                    lineTo(13f, 16f)
                    lineTo(11f, 16f)
                    lineTo(11f, 15f)
                    close()
                }
            }
        }.build()

        return _Profilememory!!
    }

private var _Profilememory: ImageVector? = null

