package github.xcodebn.intellijiconscompose.graph

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ZoominDark: ImageVector
    get() {
        if (_ZoominDark != null) return _ZoominDark!!

        _ZoominDark = ImageVector.Builder(
            name = "ZoominDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(8f, 15f)
                curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
                curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                close()
                moveTo(8f, 14f)
                curveTo(11.14f, 13.69f, 13.69f, 11.14f, 13.69f, 8.00f)
                curveTo(13.69f, 4.86f, 11.14f, 2.31f, 8.00f, 2.31f)
                curveTo(4.86f, 2.31f, 2.31f, 4.86f, 2.31f, 8.00f)
                curveTo(2.31f, 11.14f, 4.86f, 13.69f, 8.00f, 13.69f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(8f, 15f)
                    curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                    curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                    curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
                    curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                    close()
                    moveTo(8f, 14f)
                    curveTo(11.14f, 13.69f, 13.69f, 11.14f, 13.69f, 8.00f)
                    curveTo(13.69f, 4.86f, 11.14f, 2.31f, 8.00f, 2.31f)
                    curveTo(4.86f, 2.31f, 2.31f, 4.86f, 2.31f, 8.00f)
                    curveTo(2.31f, 11.14f, 4.86f, 13.69f, 8.00f, 13.69f)
                    close()
                }
            }
        }.build()

        return _ZoominDark!!
    }

private var _ZoominDark: ImageVector? = null

