package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PreviousoccurenceDark: ImageVector
    get() {
        if (_PreviousoccurenceDark != null) return _PreviousoccurenceDark!!

        _PreviousoccurenceDark = ImageVector.Builder(
            name = "PreviousoccurenceDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _PreviousoccurenceDark!!
    }

private var _PreviousoccurenceDark: ImageVector? = null

