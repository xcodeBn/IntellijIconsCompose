package github.xcodebn.intellijiconscompose.graph

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Grid: ImageVector
    get() {
        if (_Grid != null) return _Grid!!

        _Grid = ImageVector.Builder(
            name = "Grid",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 2f)
                close()
                moveTo(3f, 3f)
                lineTo(3f, 13f)
                lineTo(13f, 13f)
                lineTo(13f, 3f)
                lineTo(3f, 3f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(2f, 2f)
                    lineTo(14f, 2f)
                    lineTo(14f, 14f)
                    lineTo(2f, 14f)
                    lineTo(2f, 2f)
                    close()
                    moveTo(3f, 3f)
                    lineTo(3f, 13f)
                    lineTo(13f, 13f)
                    lineTo(13f, 3f)
                    lineTo(3f, 3f)
                    close()
                }
            }
        }.build()

        return _Grid!!
    }

private var _Grid: ImageVector? = null

